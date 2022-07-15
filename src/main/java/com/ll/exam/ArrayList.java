package com.ll.exam;

public class ArrayList {

    int[] datum;
    int size;

    ArrayList(){
        datum = new int[2];
        size = 0;
    }
    public int size() {
        return size;
    }

    public void add(int value) {
        extendList();

        datum[size] = value;
        size++;
    }

    public int get(int index) {
        return datum[index];
    }

    public void removeAt(int index) {
        for (int i = index; i < size; i++) {
            datum[index] = datum[index + 1];
        }
        size--;
    }

    public int getArrayLength() {
        return datum.length;
    }

    public void extendList() {

        if (size >= datum.length) {
            int[] newdatum = new int[datum.length * 2];
            for (int i = 0; i < datum.length; i++) {
                newdatum[i] = datum[i];
            }
            datum = newdatum;

            System.out.println("배열의 크기가 증가하였습니다.");
        }
    }

    public void showAllValues() {

        System.out.println("== 전체 데이터 출력 ==");

        for (int i = 0; i < size; i++) {
            System.out.println(i + " : " + datum[i]);
        }
    }
}
