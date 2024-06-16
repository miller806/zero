<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${subpackage}.service;
import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.dto.${className}DTO;
import com.udun.web.service.IBaseService;
import com.udun.web.domain.page.PageData;

import java.util.List;

/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
public interface  ${className}Service extends IBaseService<${className}DO>{
}
