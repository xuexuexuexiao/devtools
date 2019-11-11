/*
package work.devtools.common.dao;

import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import work.devtools.common.domain.po.LogDO;

import java.util.List;

*/
/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 操作日志Dao
 * @create: 2019-04-12
 **//*

@Repository
public interface LogDao extends JpaRepository<LogDO,Long>{

    */
/**
     * 根据id删除操作日志
     * @param id
     * @return
     *//*

    @Modifying
    @Transactional
    @Query(value = "delete  from LogDO where id=?1")
    int  deleteByLogId(Long id);

    */
/**
     * 删除删除日志
     * @param ids
     * @return
     *//*

    @Modifying
    @Transactional
    @Query(value = "delete from LogDO log where log.id in (:ids)")
    int deleteByIds(@Param("ids")List<Long> ids);
}
*/
