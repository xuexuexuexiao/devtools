package work.devtools.common.validator;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import work.devtools.modules.DEV.pojo.po.T_company;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-09
 **/

//@SupportedValidationTarget(value = { ValidationTarget.PARAMETERS })
public class T_companyValidator implements ConstraintValidator<CompanyValidator,T_company>{
    @Override
    public void initialize(CompanyValidator constraintAnnotation) {

    }

    @Override
    public boolean isValid(T_company t_company, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        //获取属性值
        try {
            String company01 = BeanUtils.getProperty(t_company,"company01");
            String company02 = BeanUtils.getProperty(t_company,"company02");
            String company03 = BeanUtils.getProperty(t_company,"company03");
            /**
             * 校验逻辑
             */
            if(StringUtils.isBlank(company01)){
                return false;
            }
            if(StringUtils.isBlank(company02)){
                return false;
            }
            if(StringUtils.isBlank(company03)){
                return false;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }
}
