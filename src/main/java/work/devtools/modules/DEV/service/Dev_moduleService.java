package work.devtools.modules.DEV.service;

import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.pojo.dto.Dev_module;

import java.util.List;

/**
 * Created on 2019/04/18.
 *
 * @author CPQ
 */
@Service
public interface Dev_moduleService {

	/**
	 * 添加
	 * @param dto
	 */
	Dev_module insert(Dev_module dto);

	/**
	 * 修改
	 * @param dto
	 */
	Dev_module update(Dev_module dto);

	/**
	 * 删除
	 * @param dto
	 */
	void delete(Dev_module dto);

	/**
	 * 查询
	 * @param obj
	 */
	List<Dev_module> query(Object obj);

}
