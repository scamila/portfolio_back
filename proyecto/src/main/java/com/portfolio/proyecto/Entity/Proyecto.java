
The following has evaluated to null or missing:
==> licensePrefix  [in template "Templates/Licenses/license-default.txt" at line 2, column 3]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${licensePrefix}  [in template "Templates/Licenses/license-default.txt" at line 2, column 1]
	- Reached through: #include "${project.licensePath}"  [in template "Templates/Classes/Class.java" at line 1, column 1]
----Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
The following has evaluated to null or missing:
==> licensePrefix  [in template "Templates/Licenses/license-default.txt" at line 4, column 3]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${licensePrefix}  [in template "Templates/Licenses/license-default.txt" at line 4, column 1]
	- Reached through: #include "${project.licensePath}"  [in template "Templates/Classes/Class.java" at line 1, column 1]
----Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


package com.portfolio.proyecto.Entity;


public class Proyecto {

}
