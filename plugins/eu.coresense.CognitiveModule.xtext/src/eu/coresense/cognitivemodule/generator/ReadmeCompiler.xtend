package eu.coresense.cognitivemodule.generator

import eu.coresense.CognitiveModule.CognitiveModule

class ReadmeCompiler {

        def compile_toREADME(CognitiveModule cogmod) '''
# «cogmod.name»

In the CORESENSE project a fundamental part of the architecture are the cognitive modules which can support the most diverse capabilities such as perception, memory, thinking, understanding, deciding, adaptation, interacting, reacting, or awareness,

All these cognitive modules must follow the here represented structure:

<table>
  <tr>
    <td colspan="3" align="center">⬆⬇</td>
  </tr>
  <tr>
    <td colspan="3" align="center"><b>Meta</b></td>
  </tr>
  <tr>
    <td colspan="3" align="center"><br></td> <!-- Spacer row -->
  </tr>
  <tr>
    <td colspan="3" align="center"><b>Core (Model + Engine)</b></td>
  </tr>
  <tr>
    <td colspan="3" align="center"><br></td> <!-- Spacer row -->
  </tr>
  <tr>
    <td align="center"><b>Afferents</b></td>
    <td align="center"><b>Coupling</b></td>
    <td align="center"><b>Efferents</b></td>
  </tr>
  <tr>
    <td align="center">⬆⬆</td>
    <td align="center">⬆⬇</td>
    <td align="center">⬇⬇</td>
  </tr>
</table>


In this case, the interfaces are defined as:
********
### Core
«cogmod.core.name»
********

### Meta
«cogmod.meta.name»
********

### Coupling
«cogmod.coupling.name»
********

### Afferents
«FOR af:cogmod.afferent»
- «af.topic» [«af.type»]
«ENDFOR»

********

### Efferents
«FOR ef:cogmod.efferent»
- «ef.topic» [«ef.type»]
«ENDFOR»

********





This package has be created automatically using the [RosTooling](https://github.com/ipa320/RosTooling). 

    '''}
    
    
