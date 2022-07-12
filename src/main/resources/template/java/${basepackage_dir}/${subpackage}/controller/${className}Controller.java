<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.${subpackage}.controller;

import com.udun.common.Result;
import com.udun.common.errorCode.UCode;
import com.udun.common.exception.CommonException;
import com.udun.web.domain.page.PageData;
import com.udun.util.UBeanUtil;
import com.udun.web.controller.BaseController;
import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.dto.${className}DTO;
import ${basepackage}.${subpackage}.query.${className}Query;
import ${basepackage}.${subpackage}.service.${className}Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author miller
 * @date ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
@RestController
@Api(tags = "${table.remarks}操作接口")
@RequestMapping("/${classNameLower}")
public class ${className}Controller extends BaseController<${className}DO, ${className}Service>{

	@ApiOperation("按ID查询${table.remarks}")
    @GetMapping("/{id}")
    public ${className}DTO get(@PathVariable @ApiParam(value = "ID", required = true) <#if table.idColumn??>${table.idColumn.javaType.simpleName}<#else>Integer</#if> id) {
        ${className}DO ${classNameLower} = baseService.getById(id);
        if (${classNameLower} == null) {
            throw new CommonException(UCode.A.DATA_NOT_EXISTED.getCode());
        }
        return UBeanUtil.copyProperties(${classNameLower}, new ${className}DTO());
    }

    @ApiOperation("增加${table.remarks}")
    @PostMapping()
    public void save(@RequestBody @Valid ${className}DTO ${classNameLower}DTO) {
        baseService.save(UBeanUtil.copyProperties(${classNameLower}DTO, new ${className}DO()));
    }

    @ApiOperation("按ID删除${table.remarks}")
    @DeleteMapping("/{id}")
    public void remove(@PathVariable @ApiParam(value = "ID", required = true) <#if table.idColumn??>${table.idColumn.javaType.simpleName}<#else>Integer</#if> id) {
        baseService.removeById(id);
    }

    @ApiOperation("更新${table.remarks}")
    @PutMapping()
    public void update(@RequestBody  @Valid ${className}DTO ${classNameLower}DTO) {
        baseService.updateById(UBeanUtil.copyProperties(${classNameLower}DTO, new ${className}DO()));
    }

    @ApiOperation("分页查询${table.remarks}")
    @GetMapping("list")
    public Result<PageData<${className}DTO>> list(${className}Query ${classNameLower}Query) {
        startPage();
        return Result.ok(table(baseService.list(${classNameLower}Query)));
    }
}
