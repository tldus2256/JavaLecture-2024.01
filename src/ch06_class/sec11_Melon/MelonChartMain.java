package src.ch06_class.sec11_Melon;

import java.util.ArrayList;
import java.util.List;

public class MelonChartMain {
    public static void main(String[] args) {
        // 기본 생성자로 객체 생성, setter로 필드값을 설정
        MelonChart melonChart = new MelonChart();
        melonChart.setRank(1);melonChart.setTitle("비의랩소디");melonChart.setArtist("임재현");
        melonChart.setAlbum("비의랩소디");melonChart.setLike(33875);
        System.out.println(melonChart);

        // 필드값을 객체 생성할때 부여
        MelonChart melonChart1 = new MelonChart(2, "To. X", "태연", "To.X", 83812);

        MelonChart[] melonCartArray = {melonChart, melonChart1,
                new MelonChart(3, "Perfect night","르세라핌","perfect night",95252),
                new MelonChart(4, "에피소드","이무진","에피소드",95252),
                new MelonChart(5, "Drama","에스파","Drama",68790)};

        for (MelonChart mc:melonCartArray)
            System.out.println(mc);

        // array안쓰고 실전용
        List<MelonChart> list = new ArrayList<>();
        list.add(melonChart); list.add(melonChart1);
        list.add(new MelonChart(3, "Perfect night","르세라핌","perfect night",95252));
        list.add(new MelonChart(4, "에피소드","이무진","에피소드",95252));
        list.add(new MelonChart(5, "Drama","에스파","Drama",68790));
//        for (MelonChart mc:list)
//            System.out.println(mc);
        list.forEach(x -> System.out.println(x));
    }

}
