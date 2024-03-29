package org.jiyunkim1.persistence;

import java.util.List;

import org.jiyunkim1.domain.Criteria;
import org.jiyunkim1.domain.PostVO;
import org.jiyunkim1.domain.SearchCriteria;

public interface PostDAO {
	
	public void create(PostVO vo)throws Exception;
	
	public void updateGroup(PostVO vo)throws Exception;
	
	public void reply(PostVO vo)throws Exception;
	
	public void updateReplyGroup(PostVO vo)throws Exception;
	
	public PostVO read(Integer postId)throws Exception;
	
	public void update(PostVO vo)throws Exception;
	
	public void delete(Integer postId)throws Exception;
	
	public List<PostVO> listAll()throws Exception;
	
	public abstract List<PostVO> listPage(int page)throws Exception;
	
	public List<PostVO> listCriteria(Criteria cri)throws Exception;
	
	public abstract Integer countPaging(Criteria cri)throws Exception;
	
	public void updateViewCnt(Integer postId)throws Exception;
	
	//Dynamic SQL 
	
	public List<PostVO> listSearch(SearchCriteria cri)throws Exception;
	
	public int listSearchCount(SearchCriteria cri)throws Exception;

}
