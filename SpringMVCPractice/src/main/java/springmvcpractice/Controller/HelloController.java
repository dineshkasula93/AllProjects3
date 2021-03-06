/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmvcpractice.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;



/**
 *
 * @author Foxy
 */
@Controller
@RequestMapping(value ="/test")
public class HelloController {
    
   @RequestMapping(method=RequestMethod.GET)
    public String printWelcome(Model model)
    {
	   UserInfo info = new UserInfo();
		model.addAttribute("info", info);
        return "hello";
    }
  
     
     @RequestMapping(method=RequestMethod.POST)
    public String printOther(@Valid @ModelAttribute UserInfo info, BindingResult result, HttpServletRequest model)
    {
       
        
        
//        UserInfo info = new UserInfo();
        ArrayList<UserInfo> userInfoIterator = new ArrayList<>();
        String Name = model.getParameter("Name");
        String Course = model.getParameter("Course");
        int Fee = Integer.parseInt(model.getParameter("Fee"));
        int Year = Integer.parseInt(model.getParameter("Year"));
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String curDate = (String)dateFormat.format(date);
        
        info.setName(Name);
        info.setCourse(Course);
        info.setFee(Fee);
        info.setYear(Year);
        info.setCurDate(curDate);
        userInfoIterator.add(info);
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.getConnection();
        dbc.createTable();
        dbc.InsertUserInfoValues(userInfoIterator);
        String NameRet="",CourseRet="",CurDateRet="";
        int i=0,FreRet=0,YearRet=0;
   
         String Name1 = dbc.RetrieveUserInformationValues().get(dbc.UserRetrevialInfo.size()-1).getName();
         String Course1 = dbc.RetrieveUserInformationValues().get(dbc.UserRetrevialInfo.size()-1).getCourse();
         int fee1 = dbc.RetrieveUserInformationValues().get(dbc.UserRetrevialInfo.size()-1).getFee();
         int year1 = dbc.RetrieveUserInformationValues().get(dbc.UserRetrevialInfo.size()-1).getYear();
         String curDate1 = dbc.RetrieveUserInformationValues().get(dbc.UserRetrevialInfo.size()-1).getCurDate();
         dbc.closeConnection();
         
        model.setAttribute("NameRet", Name1);
        model.setAttribute("CourseRet", Course1);
        model.setAttribute("FreRet", fee1);
        model.setAttribute("YearRet", year1);
        model.setAttribute("CurDateRet", curDate1);
        
        if(result.hasErrors())
        {
            return "hello"; 
        }
        
       return "other";
    }
    
 
}
