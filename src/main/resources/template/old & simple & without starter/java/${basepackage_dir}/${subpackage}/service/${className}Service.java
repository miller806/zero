<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${subpackage}.service;
import ${basepackage}.${subpackage}.entity.${className}DO;
import com.baomidou.mybatisplus.service.IService;

/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
public interface  ${className}Service extends IService<${className}DO>{

}
