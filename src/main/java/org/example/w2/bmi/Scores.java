package org.example.w2.bmi;

import lombok.*;
import org.checkerframework.checker.units.qual.A;

@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Scores {

    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    private int subject5;

    public int getSubject6() {
        return subject1 + subject2 + subject3 + subject4 + subject5;
    }

    public void close() {
        System.out.println("close...................");
        System.out.println("close...................");
        System.out.println("close...................");
        System.out.println("close...................");
    }

}