package work.devtools.modules.DEV.service;
import org.springframework.data.domain.Page;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.modules.DEV.mappers.Dev_proglangMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_prog;
import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.pojo.dto.Dev_proglang;

import java.util.List;

/**
 * Created on 2019/04/18.
 *
 * @author CPQ
 */
@Service
public interface Dev_progService {

	/**
	 * 添加
	 * @param dto
	 */
	Dev_prog insert(Dev_prog dto);

	/**
	 * 修改
	 * @param dto
	 */
	Dev_prog update(Dev_prog dto);

	/**
	 * 删除
	 * @param ids
	 */
	void delete(List<String> ids);

	/**
	 * 查询
	 * @param queryCode
	 * @param queryParams
	 */
	Page<Dev_prog> query(String queryCode, QueryParams queryParams);

	/**
	 *	获取程序国际化列表
	 * @param progCode
	 * @return
	 */
	List<Dev_proglang> queryProgLang(String progCode);

	/**
	 *	修改程序国际化
	 * @param dev_proglang
	 * @return
	 */
	public Dev_proglang updateProgLang(Dev_proglang dev_proglang);

	/**
	 * 批量修改程序国际化
	 * @param dev_proglangs
	 * @return
	 */
	public List<Dev_proglang> updateProgLangBatch(List<Dev_proglang> dev_proglangs);

	/**
	 * 处理按钮清单
	 * @param progCode
	 */
	void handleProgActionList(String progCode);

}
