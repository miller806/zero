<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${subpackage}.service.impl;

import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.mapper.${className}Mapper;
import ${basepackage}.${subpackage}.service.${className}Service;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
@Service
public class ${className}ServiceImpl extends ServiceImpl<${className}Mapper, ${className}DO> implements ${className}Service{

}
