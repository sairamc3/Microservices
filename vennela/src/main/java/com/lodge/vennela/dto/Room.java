package com.lodge.vennela.dto;

import com.lodge.vennela.common.STATUS;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Room implements Comparable{

    private int number;
    private STATUS status;
    private int floor;

    @Override
    public int compareTo(Object o) {

        if(o instanceof Room){
            Room room = (Room) o;
            if (room.getNumber()==number) {
                return 1;
            }
        }

        return 0;
    }
}
