<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${subpackage}.service;
import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.dto.${className}DTO;
import ${basepackage}.${subpackage}.vo.${className}VO;
import ${basepackage}.${subpackage}.query.${className}Query;
import com.udun.web.service.IBaseService;
import com.udun.web.domain.page.PageData;

import java.util.List;

/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
public interface  ${className}Service extends IBaseService<${className}DO>{
    /**
     * 根据条件查询${table.remarks}
     *
     * @param ${classNameLower}Query 查询条件
     * @return 集合
     */
    List<${className}VO> list(${className}Query ${classNameLower}Query);

    /**
     * 根据条件分页查询${table.remarks}
     *
     * @param ${classNameLower}Query 查询条件
     * @return 分页结果
     */
    PageData<${className}VO> page(${className}Query ${classNameLower}Query);
}
