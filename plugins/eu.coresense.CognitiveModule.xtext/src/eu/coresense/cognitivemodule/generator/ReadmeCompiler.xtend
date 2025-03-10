package eu.coresense.cognitivemodule.generator

import eu.coresense.CognitiveModule.CognitiveModule

class ReadmeCompiler {

        def compile_toREADME(CognitiveModule cogmod) '''
# «cogmod.name»

This package has be created automatically using the [RosTooling](https://github.com/ipa320/RosTooling). 


This Cognitive Module has the following structure:

### Core
«cogmod.core.name»

### Meta
«cogmod.meta.name»

### Coupling
«cogmod.coupling.name»

### Afferents
«FOR af:cogmod.afferent»
- «af.topic» [«af.type»]
«ENDFOR»

### Efferents
«FOR ef:cogmod.efferent»
- «ef.topic» [«ef.type»]
«ENDFOR»

    '''}
    
    
