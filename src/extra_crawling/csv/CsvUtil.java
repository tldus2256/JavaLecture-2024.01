package src.extra_crawling.csv;

import java.util.List;

public interface CsvUtil {
    List<List<String>> readCsv(String filename);
    List<List<String>> readCsv(String filename, String separator);
    List<List<String>> readCsv(String filename, int skipline);
    List<List<String>> readCsv(String filename, String separator, int skipline);

    void writeCsv(String filename, List<List<String>> dataList);
    void writeCsv(String filename, List<List<String>> dataList, String separator);

}
