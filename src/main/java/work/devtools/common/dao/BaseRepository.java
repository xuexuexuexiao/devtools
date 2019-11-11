/*
package work.devtools.common.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

*/
/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 基础Repository
 * @create: 2019-04-12
 **//*

@Repository
@Transactional(readOnly = true)
public interface BaseRepository<T,String> extends JpaRepository<T,String>{


    @Query()
    public List<Object> listBySQL(String sql);

    @Transactional
    @Query()
    public void updateBySql(String sql,Object...args);


    @Transactional
    @Query()
    public void deleteByIds(List<String> ids);

}
*/
