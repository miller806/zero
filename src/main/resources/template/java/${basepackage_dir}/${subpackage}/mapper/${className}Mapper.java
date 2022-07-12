<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.${subpackage}.mapper;
import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.query.${className}Query;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


/**
 * @author miller
 * @date ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
public interface  ${className}Mapper extends BaseMapper<${className}DO>{
        /**
         * 根据条件查询${table.remarks}
         *
         * @param ${classNameLower}Query 查询条件
         * @return list
         */
        List<${className}DO> list(${className}Query ${classNameLower}Query);
}
