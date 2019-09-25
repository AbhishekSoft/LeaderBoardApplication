package com.junglee.service.impl;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.junglee.common.LeaderBoardResponse;
import com.junglee.common.RequestJson;
import com.junglee.common.ResponseObject;
import com.junglee.model.Player;
import com.junglee.model.Team;
import com.junglee.repositories.PlayerRepository;
import com.junglee.repositories.TeamRepository;
import com.junglee.service.LeaderService;

@Service
public class LeaderServiceImpl implements LeaderService{
	/*
	 * Implementation of services. 
	 */
	
	
	@Autowired
	private TeamRepository teamRepo;
	
	@Autowired PlayerRepository playerRepo;




	@Override
	public ResponseObject leaderBoard() {
		ResponseObject respObj = new ResponseObject();
		try {
			Integer rank = 0;
			List<Team> teamList = teamRepo.findAll();
			
			//Since we  do not have real DB configured and list of teams available, creating static list of Team and there score for the algorithm implementation.
			if(CollectionUtils.isEmpty(teamList)) {
				for(int i =1;i<100;i++) {
					Team t = new Team();
					t.setId(Integer.toUnsignedLong(i));
					t.setTeamName("TeamName"+i);
					t.setTotalScore(Double.valueOf(i*4*0.52));
					if(i%7==0) {
						t.setTotalScore(Double.valueOf(5));
					}
					if(i%7==6) {
						t.setTotalScore(Double.valueOf(20));
					}
					System.out.println(t.getTeamName() +"\t"+t.getTotalScore());
					teamList.add(t);
				}				
			}
//			teamList.forEach(t->{calculateTotalScore(t);});
			
			/*
			 * Sorting the list of teams based on there score in reverse order so that team with maximum value will be at Top.
			 * 
			 */
		
			
			teamList=teamList.stream().filter(t ->t.getTotalScore()!=null).sorted(Comparator.comparingDouble(Team::getTotalScore).reversed()).collect(Collectors.toList());
			
			/*
			System.out.println("After Sorting the List");
			teamList.forEach(t->{
				System.out.println(t.getTeamName()+"\t"+t.getTotalScore());
			});*/
			
			/*
			 * Converted sorted Team list into Linked List of Response Object . Also Assign Natural ordering using counter.
			 */
			LinkedList<LeaderBoardResponse> leaderList = new LinkedList<>();
			
			for (Team team : teamList) {
				LeaderBoardResponse resp = new LeaderBoardResponse();
				resp.setName(team.getTeamName());
				resp.setScore(team.getTotalScore());	
				resp.setRank(++rank);
				leaderList.add(resp);
			}
			
			/*System.out.println("After Manual Ranking \n\n\n");
			leaderList.stream().forEach(System.out::println);*/
		
			
			/*
			 * Calculating Final Ranking checking for the equal scored team must get same rank . 
			 */
			ListIterator<LeaderBoardResponse> listItr = leaderList.listIterator(1);
			System.out.println("Started Final Ranking ################################\n\n");
			while (listItr.hasNext()) {
		// Step 1 :- Iterate over each of the element of Linked list and select two consecutive element as below. 
				LeaderBoardResponse lastObj = listItr.previous();
				listItr.next();
				LeaderBoardResponse currObj = listItr.next();

/*				System.out.println("Current Object \t "+currObj.toString());
				System.out.println("Last Object \t "+lastObj.toString());*/
				
		// Step 2 :- compare the score of two consecutive teams in linked list and update rank if the score is same other wise let it have natural ordering.
				int comp = Double.compare(lastObj.getScore(), currObj.getScore());
				if(comp==0) {
					currObj.setRank(lastObj.getRank());
				}
				
//				System.out.println("Current Object \t "+currObj.toString());
			}
			System.out.println("################After Final Ranking#########################\n\n\n\n");
			leaderList.stream().forEach(System.out::println);
			respObj.setResponseData(leaderList);
			respObj.setResponseMessage("Success");
			
		}catch (Exception e){
			e.printStackTrace();
			respObj.setResponseData(null);
			respObj.setResponseMessage("Failure");
		}
		return respObj;
	}

	@Override
	public void calculateTotalScore(Team team) {
		// Implement this method to calculate final score of each team based on the indivisual score of each team member implementing logic for captain and vice- captain
		
	}

	@Override
	public void saveTeam(RequestJson request) {
		// implement this method to save the team details for each of the team registration
		
	}

	@Override
	public void assignPlayerScore() {
		// Implement this method to assign each player the score.
		
	}
	
	// add or implement other methods as needed. 

}
