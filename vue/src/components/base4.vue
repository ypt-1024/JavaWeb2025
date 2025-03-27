<script type="module" setup>
import {ref} from "vue";

let counter = ref(0);

function show() {
  alert(counter.value);
}
</script>

<template>
  <div>
    <button @click="counter--">-</button>
    {{ counter }}
    <button @click="counter++">+</button>
    <hr>
    <button @click="show()">显示counter值</button>
  </div>
</template>

<style scoped>
</style>
