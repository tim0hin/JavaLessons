import java.util.ArrayList;
import java.util.Collections;

public class sem3_task3 {
    public static void main(String[] args) {
        // Заполнить список названиями планет Солнечной системы
        //  в произвольном порядке с повторениями. 
        // Вывести название каждой планеты и количество его повторений в списке.
        ArrayList<String> listPlanet = new ArrayList<>();
        getPlanets(listPlanet);
        System.out.println(listPlanet);
        printPlanets(listPlanet);
    } 
    
    static void getPlanets(ArrayList<String> listPlanet){
        listPlanet.add("Меркурий");
        listPlanet.add("Земля");
        listPlanet.add("Земля");
        listPlanet.add("Нептун");
        listPlanet.add("Земля");
        listPlanet.add("Меркурий");
        listPlanet.add("Юпитер");
        listPlanet.add("Юпитер");
        listPlanet.add("Юпитер");
        listPlanet.add("Юпитер");
        listPlanet.add("Юпитер");
        listPlanet.add("Марс");



    }

    static void printPlanets(ArrayList<String> listPlanet){
        Collections.sort(listPlanet);
        System.out.println(listPlanet);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < listPlanet.size()-1; i++){
            if (listPlanet.get(i) == listPlanet.get(i+1)){
                count++;
            }
            else{
                sb.append(listPlanet.get(i) + "_" + count + " ");
                count = 0;
            }

            if (i == listPlanet.size()-2){
                sb.append(listPlanet.get(i) + "_" + count + " ");    
            }
            
        }

        System.out.println(sb);
    }
}
