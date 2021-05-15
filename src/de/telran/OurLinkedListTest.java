package de.telran;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest extends OurListTest{

    @BeforeEach
    public  void  init(){
        integerList = new OurLinkedList<>();
        stringList = new OurLinkedList<>();

    }
}