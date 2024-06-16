<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.${subpackage}.mapper;
import ${basepackage}.${subpackage}.entity.${className}DO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
public interface  ${className}Mapper extends BaseMapper<${className}DO>{

}
