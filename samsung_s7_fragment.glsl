#version 300 es
#extension GL_OES_EGL_image_external_essl3 : require
precision highp float;

in vec2 vTextureCoord;
out vec4 fragColor;
uniform samplerExternalOES sTexture;
// S7 Color matrix and Sobel edge focus peaking
