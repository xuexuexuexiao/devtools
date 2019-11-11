package work.devtools.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 公司校验器
 * @create: 2019-04-09
 **/

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = T_companyValidator.class)
@Target(value = { ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
public @interface CompanyValidator {
    String message() default "不能为空";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};
}
