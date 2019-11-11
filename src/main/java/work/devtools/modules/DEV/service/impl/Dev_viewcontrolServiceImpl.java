package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.devtools.common.domain.ui.ElementUIInput;
import work.devtools.modules.DEV.dao.T_viewcontrolDao;
import work.devtools.modules.DEV.pojo.po.T_viewcontrol;
import work.devtools.modules.DEV.service.Dev_viewcontrolService;

import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-15
 **/
@Service
public class Dev_viewcontrolServiceImpl implements Dev_viewcontrolService {

    @Autowired
    private T_viewcontrolDao t_viewcontrolDao;

    @Override
    public List<ElementUIInput> findByViewcontrol01(String viewcontrol01) {
        return t_viewcontrolDao.findByViewcontrol01(viewcontrol01);
    }
}
