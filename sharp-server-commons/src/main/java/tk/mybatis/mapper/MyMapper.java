package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by rick on 7/6/18.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}