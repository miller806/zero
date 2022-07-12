<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.${subpackage}.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author miller
 * @date ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
<#list table.columns as column>
<#if column.pk>
<#assign pkType = column.javaType.simpleName>   
</#if>
</#list>
@Data
@ApiModel(value = "${className}", description = "${table.remarks}")
public class ${className}DTO implements Serializable{

	<#list table.columns as column>
	<#if column.remarks??>
	<#assign propertyName = column.remarks>
	<#else>
	<#assign propertyName = column.columnNameLower>
	</#if>
	@ApiModelProperty(value="${propertyName}")
	private ${column.javaType.simpleName} ${column.columnNameLower};
	
	</#list>
}

