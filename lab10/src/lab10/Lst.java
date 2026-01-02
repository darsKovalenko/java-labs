package lab10;

import java.util.ArrayList;


public class Lst{
    private ArrayList<Integer> list;

    public Lst(){
        list = new ArrayList<>();
    }

    public int getSize(){
        return list.size();
    }
    public void add(Integer num){
        list.add(num);
    }

    public void addIndex(int index, Integer num){
        list.add(index,num);
    }

    public void deleteNum(Integer num){
        if (list.contains(num)){
            list.remove(num);
        }
        else{
            System.out.println("Такого числа нет в списке");
        }
    }
    public void deleteIndex(int index){
        if (index < 0 || index > this.getSize()){
            System.out.println("Индекс не соответствует списку");
        }
        else{
            list.remove(index);
        }
    }

    public void printList(){
        for (Integer elem: list){
            System.out.print(elem+" ");
        }
        System.out.println();
    }

    public Integer find(Integer num){
        Integer min = list.get(0);
        for (Integer elem: list){
            if (Math.abs(elem - num)< Math.abs(min - num)){
                min = elem;
            }
        }
        return min;
    }
}
