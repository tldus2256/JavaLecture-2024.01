package src.extra_crawling.sec02_interpark_book;

import src.extra_crawling.csv.CsvUtil;
import src.extra_crawling.csv.CsvUtilImpl;

import java.util.List;

public class CsvReaderMain {
    public static void main(String[] args) {
        CsvUtil csvUtil = new CsvUtilImpl();
        List<List<String>> csvList = csvUtil.readCsv("c:/Temp/interpark.tsv","\t");

        for (List<String> line: csvList) {
            InterparkBook ib = new InterparkBook(
                    Integer.parseInt(line.get(0)),
                    line.get(1), line.get(2), line.get(3),
                    Integer.parseInt(line.get(4)));
            System.out.println(ib);
        }
    }
}
