<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.${subpackage}.controller;

import com.udun.web.controller.BaseController;
import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.service.${className}Service;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

import javax.validation.Valid;

/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
@RestController
@Api(tags = "${table.remarks}操作接口")
@RequestMapping("/${classNameLower}")
public class ${className}Controller{

}
