<script type="module" setup>
import {reactive, ref} from "vue";

let data = reactive(
    {
      count: 0,
    }
)

function show() {
  alert(data.count);
}
</script>

<template>
  <div>
    <button @click="data.count--">-</button>
    {{ data.count }}
    <button @click="data.count++">+</button>
    <hr>
    <button @click="show()">显示counter值</button>
  </div>
</template>

<style scoped>
</style>
