package com.tmh.service.impl;

import com.tmh.model.CourseCustom;
import com.tmh.service.CourseService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jacey on 2017/7/5.
 */
public class CourseServiceImplTest {


    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml",
                "spring/applicationContext-service.xml"});
    }

    @Test
    public void findById() throws Exception {

        CourseService courseService = (CourseService) applicationContext.getBean("courseServiceImpl");

        CourseCustom courseCustom = courseService.findById(1);

        System.out.println();
    }

    @Test
    public void findByTeacherID() throws Exception {

        CourseService courseService = (CourseService) applicationContext.getBean("courseServiceImpl");

        courseService.findByTeacherID(1001);

    }

}