package M.S.C.minsu.controller;


import M.S.C.minsu.repository.LectureRepository;
import M.S.C.minsu.repository.LectureRoomRepository;
import M.S.C.minsu.service.LectureRoomService;
import M.S.C.minsu.service.LectureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

@Controller
@Slf4j //로깅을 위한 어노테이션
public class LectureRoomController {

    @Autowired
    private JdbcTemplate jdbctemplate;



    @RequestMapping(method= RequestMethod.GET, value="/resultLectureRoom")//현재 요일 반환
    public void LectureRoom(HttpServletRequest httpServletRequest){
        // 현재 날짜 구하기
        LocalDate nowDate = LocalDate.now();

        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = nowDate.getDayOfWeek();

        //텍스트 요일 구하기
        String nowDayOfWeek=dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN);

        // 현재 시간
        LocalTime nowTime = LocalTime.now();
        // 시, 분
        int hour = nowTime.getHour();
        int minute = nowTime.getMinute();



    }

//    @Autowired //스프링 부트가 미리 생성해놓은 객체를 가젹다가 자동 연결
//    private LectureRoomRepository lectureRoomRepository;
//
//    @Autowired
//    private LectureRoomService lectureRoomService;
}