<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${subpackage}.service.impl;

import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.dto.${className}DTO;
import ${basepackage}.${subpackage}.query.${className}Query;
import ${basepackage}.${subpackage}.mapstruct.${className}Mapstruct;
import ${basepackage}.${subpackage}.mapper.${className}Mapper;
import ${basepackage}.${subpackage}.service.${className}Service;
import com.udun.web.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author miller
 * @date ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
@Service
public class ${className}ServiceImpl extends BaseServiceImpl<${className}Mapper, ${className}DO, ${className}Mapstruct> implements ${className}Service{
    @Override
    public List<${className}DTO> list(${className}Query ${classNameLower}Query) {
        return baseMapstruct.toDTO(baseMapper.list(${classNameLower}Query));
    }
}
