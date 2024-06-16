<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${subpackage}.service.impl;

import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.dto.${className}DTO;
import ${basepackage}.${subpackage}.mapstruct.${className}Mapstruct;
import ${basepackage}.${subpackage}.mapper.${className}Mapper;
import ${basepackage}.${subpackage}.service.${className}Service;
import com.udun.web.service.EvolveServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;

/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
@Service
public class ${className}ServiceImpl extends EvolveServiceImpl<${className}Mapper, ${className}DO, ${className}Mapstruct> implements ${className}Service{
}
