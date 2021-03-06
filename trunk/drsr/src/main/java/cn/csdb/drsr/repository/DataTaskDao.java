package cn.csdb.drsr.repository;

import cn.csdb.drsr.model.DataTask;
import cn.csdb.drsr.repository.mapper.DataTaskMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: DataSync
 * @description: dataTask dao
 * @author: xiajl
 * @create: 2018-09-30 16:18
 **/

@Repository
public class DataTaskDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public DataTask get(int id){
        String sql="select * from t_datatask where dataTaskId = ?" ;
        List<DataTask> list = jdbcTemplate.query(sql,new Object[]{id}, new DataTaskMapper()) ;
        return  list.size() > 0 ? list.get(0) : null;
    }
}
