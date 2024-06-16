<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.${subpackage}.controller;

import com.udun.common.Result;
import com.udun.code.ClientCode;
import com.udun.common.exception.CommonException;
import ${basepackage}.${subpackage}.mapstruct.${className}Mapstruct;
import com.udun.web.domain.page.PageData;
import com.udun.web.controller.EvolveController;
import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.dto.${className}DTO;
import ${basepackage}.${subpackage}.vo.${className}VO;
import ${basepackage}.${subpackage}.query.${className}Query;
import ${basepackage}.${subpackage}.service.${className}Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
@RestController
@Api(tags = "${table.remarks}操作接口")
@RequestMapping("/${classNameLower}")
public class ${className}Controller extends EvolveController<${className}DO, ${className}Service, ${className}Mapstruct>{

	@ApiOperation("按ID查询${table.remarks}")
    @GetMapping("/{id}")
    public Result<${className}VO> get(@PathVariable @ApiParam(value = "ID", required = true) <#if table.idColumn??>${table.idColumn.javaType.simpleName}<#else>Integer</#if> id) {
        ${className}DO ${classNameLower} = baseService.getById(id);
        if (${classNameLower} == null) {
            throw new CommonException(ClientCode.A0403);
        }
        return Result.ok(baseMapstruct.toVO(${classNameLower}));
    }

    @ApiOperation("增加${table.remarks}")
    @PostMapping()
    public void save(@RequestBody @Valid ${className}DTO ${classNameLower}DTO) {
        baseService.save(baseMapstruct.toDO(${classNameLower}DTO));
    }

    @ApiOperation("按ID删除${table.remarks}")
    @DeleteMapping("/{id}")
    public void remove(@PathVariable @ApiParam(value = "ID", required = true) <#if table.idColumn??>${table.idColumn.javaType.simpleName}<#else>Integer</#if> id) {
        baseService.removeById(id);
    }

    @ApiOperation("更新${table.remarks}")
    @PutMapping()
    public void update(@RequestBody  @Valid ${className}DTO ${classNameLower}DTO) {
        baseService.updateById(baseMapstruct.toDO(${classNameLower}DTO));
    }

    @ApiOperation("分页查询${table.remarks}")
    @GetMapping("/page")
    public Result<PageData<${className}VO>> list(${className}Query ${classNameLower}Query) {
        return Result.ok(baseService.page(${classNameLower}Query));
    }
}
