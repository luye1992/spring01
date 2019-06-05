package net.wanho;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Administrator on 2019/5/27.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer id;
    private  String name;
    private  Integer age;
    private  Score score;
    private  List<Score> scores;
    private Set<Score> scoreSet;
    private Map<Integer,Score> scoreMap;
    private Properties p;

}
