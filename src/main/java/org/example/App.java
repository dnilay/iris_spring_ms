package org.example;

import org.example.bean.Coach;
import org.example.bean.CricketCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        try {
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach coach=context.getBean("theCoach",Coach.class);
            System.out.printf("your daily workout plan for the day is %s",coach.getDailyWorkout());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
