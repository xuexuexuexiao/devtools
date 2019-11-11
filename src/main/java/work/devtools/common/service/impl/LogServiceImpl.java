/*
package work.devtools.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import work.devtools.common.dao.LogDao;
import work.devtools.common.domain.po.LogDO;
import work.devtools.common.domain.po.PageDO;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.common.service.LogService;

import java.util.Arrays;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {
	@Autowired
	LogDao logDao;

	@Async
	@Override
	public void save(LogDO logDO) {
		logDao.save(logDO);
	}

	*/
/*@Override
	public PageDO<LogDO> queryList(QueryParams query) {
		int total = logDao.count(query);
		List<LogDO> logs = logDao.list(query);
		PageDO<LogDO> page = new PageDO<>();
		page.setTotal(total);
		page.setRows(logs);
		return page;
	}*//*


	@Override
	public int remove(Long id) {
		return  logDao.deleteByLogId(id);
	}

	@Override
	public int batchRemove(Long[] ids){
		return logDao.deleteByIds(Arrays.asList(ids));
	}
}
*/
