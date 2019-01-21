package org.jiyunkim1.persistence;

import java.util.List;

import org.jiyunkim1.domain.Criteria;
import org.jiyunkim1.domain.PostVO;

public interface PostDAO {
	
	public void create(PostVO vo)throws Exception;
	
	public PostVO read(Integer postId)throws Exception;
	
	public void update(PostVO vo)throws Exception;
	
	public void delete(Integer postId)throws Exception;
	
	public List<PostVO> listAll()throws Exception;
	
	public abstract List<PostVO> listPage(int page)throws Exception;
	
	public List<PostVO> listCriteria(Criteria cri)throws Exception;
	
	public int countPaging(Criteria cri)throws Exception;

}
