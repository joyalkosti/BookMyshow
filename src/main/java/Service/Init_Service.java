package Service;

import Model.*;
import Model.Constant.Auditorium_Feature;
import Model.Constant.Seat_Status;
import Model.Constant.Seat_Type;
import Model.Constant.Show_Seat_Status;
import Repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Init_Service {

    @Autowired
    private City_Repo city_repo;

    @Autowired
    private Theatre_Repo theatre_repo;

    @Autowired
    private Auditorium_Repo auditorium_repo;

    @Autowired
    private Show_Repo show_repo;

    @Autowired
    private Seat_Repo seat_repo;

    @Autowired
    private Movie_Repo movie_repo;

    @Autowired
    private User_Repo user_repo;

    @Autowired
    private Show_Seat_Repo show_seat_repo;

    public boolean initialise(){
        City kolkata=new City();
        City pune=new City();
        City canberra=new City();

        city_repo.save(kolkata);
        city_repo.save(pune);
        city_repo.save(canberra);

        City savedKolkata=city_repo.findCityByName("Delhi");
        Theatre joyalTheatre=new Theatre("Joyal_Multiplex", "anywhere");
        Theatre rohitTheatre=new Theatre("Rohit_Theatre", "Chandni Chowk");


        theatre_repo.save(joyalTheatre);
        theatre_repo.save(rohitTheatre);

        Theatre savedJoyalTheatre= theatre_repo.findTheatreByName("Joyal_Multiplex");
        Theatre savedRohitTheatre= theatre_repo.findTheatreByName("Rohit_Theatre");


        //Giving Null pointer
//        List<Theatre> kolkataTheatre=savedKolkata.getTheatreList();
        List<Theatre> kolkataTheatre=new ArrayList<>();
        kolkataTheatre.add(savedJoyalTheatre);
        kolkataTheatre.add(savedRohitTheatre);
        savedKolkata.setTheatreList(kolkataTheatre);

        city_repo.save(savedKolkata);


        for(int i=0; i<5; i++){
            Seats s=new Seats(i, i, i+" "+i, Seat_Type.GOLD, Seat_Status.AVAILABLE);
            seat_repo.save(s);
        }
        List<Seats> savedSeats=seat_repo.findAll(); // return all data of the table like select * from table_name;

        Auditorium auditorium=new Auditorium();
        auditorium.setName("Audi 01");
        auditorium.setCapacity(5);
        auditorium.setAuditorium_featureList(List.of(Auditorium_Feature.DOLBY, Auditorium_Feature.IMAX));
        auditorium.setSeatsList(savedSeats);
        auditorium_repo.save(auditorium);

//        savedJoyalTheatre.setAuditoriumList(List.of(auditorium_repo.findAuditoriumByName("Audi01")));
//        theatre_repo.save(savedJoyalTheatre);

        Auditorium savedAudi=auditorium_repo.findAuditoriumByName("Audi01");
        Theatre savedTheatre=theatre_repo.findTheatreByName("Joyal_Multiplex");
        List<Auditorium> auditoriumList=new ArrayList<>();
        auditoriumList.add(savedAudi);
        savedTheatre.setAuditoriumList(auditoriumList);
        theatre_repo.save(savedTheatre);


//
//        Seats S1=new Seats(1,1,"A1", Seat_Type.GOLD, Seat_Status.AVAILABLE);
//        Seats S2=new Seats(2,2,"B1", Seat_Type.GOLD, Seat_Status.AVAILABLE);
//        Seats S3=new Seats(3,3,"A3", Seat_Type.GOLD, Seat_Status.AVAILABLE);
//        Seats S4=new Seats(4,4,"A4", Seat_Type.GOLD, Seat_Status.AVAILABLE);
//        Seats S5=new Seats(5,5,"A5", Seat_Type.GOLD, Seat_Status.AVAILABLE);

//        for(int i=0; i<5; i++){
//            Seats s=new Seats(i, i, i+" "+i, Seat_Type.GOLD, Seat_Status.AVAILABLE);
//            seat_repo.save(s);
//
//            Seats savedSeat=seat_repo.findSeatBySeatNumber(i+" "+i);
//            Auditorium savedAuditorium=auditorium_repo.findAuditoriumByName("Audi01");
//            List<Seats> audiSeats= savedAuditorium.getSeatsList() ==null ? new ArrayList<>() : savedAuditorium.getSeatsList();
//            audiSeats.add(savedSeat);
//            savedAuditorium.setSeatsList(audiSeats);
//        }
//        auditorium_repo.save(auditorium);


        Movie movie=new Movie("Titanic", "best movie ever");
        movie_repo.save(movie);

        Show show=new Show();
        show.setStart_time(LocalDateTime.now());
        show.setEnd_time(LocalDateTime.now().plusMinutes(180));
        show.setMovie(movie_repo.findMovieByName("Titanic"));
        show.setAuditorium(auditorium_repo.findAuditoriumByName("Audi01"));
        show_repo.save(show);


        for(int i=0; i<5; i++){
            Show_Seat s=new Show_Seat(1200, show_repo.findById(1).get(),seat_repo.findSeatBySeatNumber(i+" "+i), Show_Seat_Status.AVAILABLE);
            show_seat_repo.save(s);
        }



        return true;
    }
}
