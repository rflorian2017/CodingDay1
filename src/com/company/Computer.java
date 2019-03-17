package com.company;

import model.*;
import model.peripheral.Peripheral;

import java.util.ArrayList;

public class Computer {
    private GraphicCard graphicCard;
    private Memory[] memories;
    private Motherboard motherboard;
    private Processor processor;

    private ArrayList<Peripheral> peripherals;

    private String producer;
    private String generation;

    public Computer() {
        memories = new Memory[1];
        peripherals = new ArrayList<>();
    }

    public void addMemory(Memory memory) {
        memories[memories.length-1] = memory;
        Memory[] newArray = new Memory[memories.length + 1];
        for (int i = 0; i < memories.length; i++) {
            newArray[i] = memories[i];
        }


        memories = new Memory[newArray.length];
        memories = newArray;
    }

    public void addPeripheral(Peripheral peripheral) {
        peripherals.add(peripheral);
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }


    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
}
