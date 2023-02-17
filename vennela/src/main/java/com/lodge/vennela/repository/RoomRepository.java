package com.lodge.vennela.repository;

import com.lodge.vennela.common.STATUS;
import com.lodge.vennela.dto.Room;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.lodge.vennela.common.STATUS.*;

@Repository
public class RoomRepository {

    private List<Room> roomList= new ArrayList<>();

    public RoomRepository() {

        roomList.add(Room.builder().number(1).status(OCCUPIED).floor(0).build());
        roomList.add(Room.builder().number(2).status(OCCUPIED).floor(0).build());
        roomList.add(Room.builder().number(3).status(EMPTY).floor(1).build());
        roomList.add(Room.builder().number(4).status(MAINTENANCE).floor(1).build());

    }

    public Room getRoomDetails(int number){
        Optional<Room> optionalRoom = roomList.stream().filter(room -> room.getNumber() == number).findAny();
        return optionalRoom.get();
    }


}
