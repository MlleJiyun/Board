package org.jiyunkim1.controller;

import java.util.logging.Logger;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.jiyunkim1.domain.PostVO;
import org.jiyunkim1.persistence.PostDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class PostDAOTest {
	
	@Inject
	private PostDAO dao;
	
	//private static Logger logger= (Logger) LoggerFactory.getLogger(PostDAOTest.class);
	
	/*
	@Test
	public void testCreate() throws Exception{
		
		PostVO post = new PostVO();
		post.setPostTitle("Title11");
		post.setPostContent("Content11");
		post.setUserId("user0011");
		dao.create(post);
		
	}
	
	
	@Test
	public void testRead() throws Exception {
		
		logger.info(dao.read(1).toString());
	}
	*/

	/*
	@Test
	public void testUpdate() throws Exception {
		
		PostVO post = new PostVO();
		post.setPostId(1);
		post.setPostTitle("Edited Title");
		post.setPostContent("Edited content");
		dao.update(post);
	}
	*/
	
	@Test
	public void testDelete() throws Exception {
		
		dao.delete(1);
	}
	
}
