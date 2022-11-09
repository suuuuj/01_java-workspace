package com.br.chap01_list.part02_mvc.controller; //여기선 입력받지 않음

import java.util.ArrayList;

import com.br.chap01_list.part01_basic.model.vo.Music;

public class MusicController {
	
	
	//초기화 블럭
	private ArrayList<Music> list = new ArrayList<>();
	{
	list.add(new Music("굿바이", "박효신"));
	list.add(new Music("술이 달다","에픽하이"));
	list.add(new Music("밥이 달다","김수정"));
	
	}
	//곡 추가 요청을 처리해주는 메소드
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist)); //비워져있는 상태 -> 전체곡 조회 거치면 채워짐
	}

	// 전체 곡 조회요청 처리해주는 메소드
	
	public ArrayList<Music> selectMusic() {
		return list; //돌려주는 리턴타입을 반환형으로 적어야하기 때문에 void->ArrayList~
		
	}

	/**
	 * 삭제 요청 처리해주는 메소드
	 * 
	 * @param (매개변수) title 사용자가 입력한 삭제할 곡 명 
	 * @return (리턴 반환값) 성공적으로 삭제시 1 | 삭제할 곡 못찾을 경우 0 
	 */
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result ++ ;
				break;
			}
		} return result;
		// result == 0 (삭제할 곡 못찾음) | 1 (성공적으로 삭제)
	}
	
	/**
	 * @param title  사용자가 입력한 수정하고자 하는 원곡명
	 * @param upTitle  사용자가 입력한 수정할 곡명
	 * @param upArtist 사용자가 입력한 수정할 가수명
	 * @return  성공적으로 수정시 1 | 수정할 곡 못찾은 경우 0
	 */
	public int updateMusic(String title,String upTitle, String upArtist) {
		
		int result = 0;
		
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				//방법1. ArrayList의 set 메소드
				//list.set(i, new Music(upTitle,upArtist));
			
				//방법2. 기존의 Music 접근해서 setter메소드 필드 수정
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				
				result++;
			}
		}
		// result == 0(수정할 곡을 찾지 못했을 경우 = 0 | 찾았을 경우 = 1)
		return result;
	}
	
	/**
	 * @param keyword 사용자가 검색하고자 하는 곡의 키워드
	 * @return 
	 */
	public ArrayList<Music> searchMusic(String keyword) {
		ArrayList<Music> searchList = new ArrayList<>(); //검색된 Music객체들을 차곡차곡 담을 ArrayList
		
		for(int i = 0; i<list.size();i++) {
			if(list.get(i)/*뮤직객체*/.getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searchList.add(list.get(i));
			}
		}
		// searchList == 텅비어있음 (검색결과 없었음) | 텅비어있지 않을 경우(검색결과 있음)
		return searchList;
	}
	
	public ArrayList<Music> searchMusic(int menu, String keyword){
		ArrayList<Music> searchList = new ArrayList<>(); //검색 결과를 보관할 리스트
	
		if(menu == 1) { //=> 곡명으로 검색
			for(Music m : list) {
				if(m.getTitle().contains(keyword)) {
					searchList.add(m);
				}
			}
		}else if(menu == 2) {// => 가수명으로 검색
			
			for(Music m : list) {
				if(m.getArtist().contains(keyword)) {
					searchList.add(m);
				}
			}
		}else if(menu == 3) {// => 곡명+가수명으로 검색
			for(Music m : list) {
				if(m.getTitle().contains(keyword)||m.getArtist().contains(keyword)) {
					searchList.add(m);
				}
			}
		}
		
		return searchList;
		
	}
	
}
