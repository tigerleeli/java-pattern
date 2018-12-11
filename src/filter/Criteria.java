package filter;

import java.util.List;

/**
 * 为标准创建一个接口
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> peoples);
}
