package org.sourcepit.emfx.codegen.ecore.templates.generator;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.sourcepit.emfx.codegen.ecore.genmodel2.*;

public class GeneratorAdapterFactory
{
  protected static String nl;
  public static synchronized GeneratorAdapterFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    GeneratorAdapterFactory result = new GeneratorAdapterFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL;
  protected final String TEXT_3 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapter" + NL + " */" + NL + "public class ";
  protected final String TEXT_4 = " extends ";
  protected final String TEXT_5 = " implements ";
  protected final String TEXT_6 = NL + "{" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected static final String MERGE_RULES_PATH_NAME = \"emf-merge.xml\";" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_7 = " generator;" + NL;
  protected final String TEXT_8 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = ";" + NL;
  protected final String TEXT_11 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_12 = "()" + NL + "\t{" + NL + "\t\tsuper();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setGenerator(";
  protected final String TEXT_13 = " generator)" + NL + "\t{" + NL + "\t\tthis.generator = generator;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_14 = " getGenerator()" + NL + "\t{" + NL + "\t\treturn generator;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void initialize(Object input)" + NL + "\t{" + NL + "\t\tinitialize((";
  protected final String TEXT_15 = ") input);" + NL + "\t}" + NL + "\t" + NL + "\t\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void initialize(";
  protected final String TEXT_16 = " input)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_17 = ".Options options = generator.getOptions();" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_18 = " resource = input.eResource();" + NL + "\t\toptions.resourceSet = resource != null ? resource.getResourceSet() : null;" + NL + "\t\toptions.mergerFacadeHelperClass = \"org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper\";" + NL + "\t\t" + NL + "\t\tinitializeMergeRules(input, options);" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */\t" + NL + "\tprotected void initializeMergeRules(";
  protected final String TEXT_19 = " input, Generator.Options options) {" + NL + "\t\tString[] templatePath = getTemplatePath();" + NL + "\t\toptions.mergeRulesURI = ";
  protected final String TEXT_20 = ".find(templatePath, MERGE_RULES_PATH_NAME);" + NL + "\t\toptions.mergerFacadeHelperClass = \"org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper\";" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected String[] getTemplatePath()" + NL + "\t{" + NL + "\t\tString[] path = new String[1];" + NL + "\t\tpath[0] = ";
  protected final String TEXT_21 = ".INSTANCE.getBaseURL().toString() + \"templates\";" + NL + "\t\treturn path;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic boolean isFactoryForType(Object type)" + NL + "\t{" + NL + "\t\treturn type == ";
  protected final String TEXT_22 = ".class;" + NL + "\t}" + NL;
  protected final String TEXT_23 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_24 = " create";
  protected final String TEXT_25 = "Adapter()" + NL + "\t{" + NL + "\t\tif (";
  protected final String TEXT_26 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_27 = " = new ";
  protected final String TEXT_28 = "(this);" + NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_29 = ";" + NL + "\t}" + NL;
  protected final String TEXT_30 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void dispose()" + NL + "\t{";
  protected final String TEXT_31 = NL + "\t\tif (";
  protected final String TEXT_32 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_33 = ".dispose();" + NL + "\t\t}";
  protected final String TEXT_34 = NL + "\t}" + NL + "}" + NL;
  protected final String TEXT_35 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    /**
 * <copyright>
 *
 * Copyright (c) Tim Baumgartner, 2009
 *
 * </copyright>
 */
    final GenPackage2 genPackage     = (GenPackage2) argument;
    final GenModel2   genModel       = genPackage.getGenModel();
    final String qualifiedAdapterFactoryName = genPackage.getUtilitiesPackageName() + '.' + genPackage.getAdapterFactoryClassName();
    final String importedAdapterFactory = genModel.getImportedName(qualifiedAdapterFactoryName);
    final String importedGenerator = genModel.getImportedName("org.eclipse.emf.codegen.ecore.generator.Generator");
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genPackage.getGeneratorPackageName());
    stringBuffer.append(TEXT_2);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getGeneratorAdapterFactoryClassName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(importedAdapterFactory);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory"));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(importedGenerator);
    stringBuffer.append(TEXT_7);
    for (GenClass genClass : genPackage.getGenClasses()) {
    GenClass2 genClass2 = (GenClass2) genClass;
    if (genClass2.isGenerateGenerator()) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getGeneratorAdapterBaseClassName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genClass2.getGeneratorAdapterField());
    stringBuffer.append(TEXT_10);
    }
    }
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genPackage.getGeneratorAdapterFactoryClassName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(importedGenerator);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(importedGenerator);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(importedGenerator);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.codegen.jet.JETCompiler"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getImportedName(genModel.getGeneratorPluginClass()));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.codegen.ecore.generator.GeneratorAdapter"));
    stringBuffer.append(TEXT_22);
    for (GenClass genClass : genPackage.getGenClasses()) {
    GenClass2 genClass2 = (GenClass2) genClass;
    if (genClass2.isGenerateGenerator()) {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getGeneratorAdapterBaseClassName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genClass2.getGeneratorAdapterField());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genClass2.getGeneratorAdapterField());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genClass2.getGeneratorAdapterClassName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genClass2.getGeneratorAdapterField());
    stringBuffer.append(TEXT_29);
    }
    }
    stringBuffer.append(TEXT_30);
    for (GenClass genClass : genPackage.getGenClasses()) {
    GenClass2 genClass2 = (GenClass2) genClass;
    if (genClass2.isGenerateGenerator()) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genClass2.getGeneratorAdapterField());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass2.getGeneratorAdapterField());
    stringBuffer.append(TEXT_33);
    }
    }
    stringBuffer.append(TEXT_34);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_35);
    return stringBuffer.toString();
  }
}
