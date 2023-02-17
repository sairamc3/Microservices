package com.lodge.vennela.controller;

import com.lodge.vennela.dto.Room;
import com.lodge.vennela.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/vennela")
public class RoomHandler {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/{number}")
    public Mono<Room> getRoomById(@PathVariable int number){
        Mono<Room> roomMono = Mono.just(roomRepository.getRoomDetails(number));
        return roomMono;
    }
}
