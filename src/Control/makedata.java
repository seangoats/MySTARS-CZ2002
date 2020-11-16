package Control;

import Entity.AccessPeriod;
import Entity.Course;
import Entity.Index;
import Entity.School;

import java.time.LocalDateTime;

public class makedata {
    public static void main(String args[]) {
        //make NBS
        LocalDateTime dateTime = LocalDateTime.parse("2019-12-13 09:00");
        LocalDateTime dateTime1 = LocalDateTime.parse("2019-12-14 09:00");
        School s = new School("Nanyang Business School", new AccessPeriod(dateTime, dateTime1));
        Course c1 = new Course("AB1202", "Statistic", 3);
        s.setCourseList(c1);
        c1.addLessonType("Lectures");
        c1.addLessonType("Tutorial");
        Index I1 = new Index("AB1202", "Statistic", 10003, "BCG2", 20);
        Index I2 = new Index("AB1202", "Statistic", 10021, "SS04", 20);
        Index I3 = new Index("AB1202", "Statistic", 10024, "SSP3", 20);
        c1.addIndex(I1);
        c1.addIndex(I2);
        c1.addIndex(I3);
        Course c2 = new Course("AB1301", "Business Law", 3);
        s.setCourseList(c2);
        c2.addLessonType("Lectures");
        c2.addLessonType("Tutorial");
        Course c3 = new Course("AB1501", "Marketing", 3);
        s.setCourseList(c3);
        c3.addLessonType("Lectures");
        c3.addLessonType("Tutorial");
        Course c4 = new Course("AB2101", "Managerial Accounting", 3);
        s.setCourseList(c4);
        c4.addLessonType("Lectures");
        c4.addLessonType("Tutorial");


        LocalDateTime startDate = LocalDateTime.parse("2020-12-06 09:00");
        LocalDateTime endDate = LocalDateTime.parse("2020-12-07 09:00");

        School SCBE = new School("School of Chemical and Biomedical Engineering", new AccessPeriod(startDate, endDate));
        Course c5 = new Course("BG2141", "Mechanics of Material", 3);
        SCBE.setCourseList(c1);
        c1.addLessonType("Lectures");
        c1.addLessonType("Tutorial");
        Index I5 = new Index("BG2141", "Mechanics of Material", 12345, "B22", 20);

        Course c6 = new Course("BG2142", "Electronics for Biomedical Engineering", 3);
        SCBE.setCourseList(c2);
        c2.addLessonType("Lectures");
        c2.addLessonType("Tutorial");
        Index I6 = new Index("BG2142", "Electronics for Biomedical Engineering", 13692, "B13", 20);

        Course c7 = new Course("BG2143", "Introduction to Computational Thinking", 3);
        SCBE.setCourseList(c3);
        c3.addLessonType("Lectures");
        c3.addLessonType("Tutorial");
        Index I7 = new Index("BG2143", "Introduction to Computational Thinking", 14855, "B01", 20);

        Course c8 = new Course("BG2144", "Biomaterials", 3);
        SCBE.setCourseList(c4);
        c4.addLessonType("Lectures");
        c4.addLessonType("Tutorial");
        Index I8 = new Index("BG2144", "Biomaterials", 16777, "B05", 20);

        //Create SCSE Data
        LocalDateTime startDateSCSE = LocalDateTime.parse("2019-12-11T09:00");
        LocalDateTime endDateSCSE = LocalDateTime.parse("2019-12-12T09:00");
        AccessPeriod SCSEAccessPeriod = new AccessPeriod(startDateSCSE,endDateSCSE);
        School SCSE = new School("SCSE",SCSEAccessPeriod);

        Course course1 = new Course("CZ2001","ALGORTIHMS",3);
        course1.addLessonType("LEC");
        course1.addLessonType("TUT");
        course1.addLessonType("LAB");
        course1.setOfferingSchool(SCSE);
        course1.addIndex(new Index("ALGORITHMS","CZ2001",474,"SP1",20));
        course1.addIndex(new Index("ALGORITHMS","CZ2001",475,"SP2",20));
        course1.addIndex(new Index("ALGORITHMS","CZ2001",476,"SP3",20));
        course1.addIndex(new Index("ALGORITHMS","CZ2001",477,"SP4",20));
        SCSE.setCourseList(course1);

        Course course2 = new Course("CZ2002","OBJECT ORIENTED DESIGN AND PROGRAMMING",3);
        course1.addLessonType("LEC");
        course1.addLessonType("TUT");
        course1.addLessonType("LAB");
        course1.setOfferingSchool(SCSE);
        course1.addIndex(new Index("OBJECT ORIENTED DESIGN AND PROGRAMMING","CZ2002",342,"SP1",20));
        course1.addIndex(new Index("OBJECT ORIENTED DESIGN AND PROGRAMMING","CZ2002",343,"SP2",20));
        course1.addIndex(new Index("OBJECT ORIENTED DESIGN AND PROGRAMMING","CZ2002",344,"SP3",20));
        course1.addIndex(new Index("OBJECT ORIENTED DESIGN AND PROGRAMMING","CZ2002",345,"SP4",20));
        SCSE.setCourseList(course2);

        Course course3 = new Course("CZ2005","OPERATING SYSTEMS",3);
        course1.addLessonType("LEC");
        course1.addLessonType("TUT");
        course1.addLessonType("LAB");
        course1.setOfferingSchool(SCSE);
        course1.addIndex(new Index("OPERATING SYSTEMS","CZ2005",681,"SP1",20));
        course1.addIndex(new Index("OPERATING SYSTEMS","CZ2005",682,"SP2",20));
        course1.addIndex(new Index("OPERATING SYSTEMS","CZ2005",683,"SP3",20));
        course1.addIndex(new Index("OPERATING SYSTEMS","CZ2005",684,"SP4",20));
        SCSE.setCourseList(course3);

        Course course4 = new Course("CZ2007","INTRODUCTION TO DATABASES",3);
        course1.addLessonType("LEC");
        course1.addLessonType("TUT");
        course1.addLessonType("LAB");
        course1.setOfferingSchool(SCSE);
        course1.addIndex(new Index("INTRODUCTION TO DATABASES","CZ2007",366,"SP6",20));
        course1.addIndex(new Index("INTRODUCTION TO DATABASES","CZ2007",367,"SP7",20));
        course1.addIndex(new Index("INTRODUCTION TO DATABASES","CZ2007",368,"SP8",20));
        course1.addIndex(new Index("INTRODUCTION TO DATABASES","CZ2007",369,"SP9",20));
        SCSE.setCourseList(course4);

    }
   // "Nanyang Business School",NBS,"2019-12-13 09:00","2019-12-14 09:00","AB1201 AB1301 AB1501 AD2101"


}